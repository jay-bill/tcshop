$(function(){

	var beginText;
	
	$("#catalog").tree({
		url:'catalog',
		method:'get',
		animate:true,
		onContextMenu:function(e,node){
			
			var root = $("#catalog").tree("getRoot");
			
			e.preventDefault();
			
			if(node!=root){

			$(this).tree('select',node.target);
			
			var flag = $("#menu").tree('isLeaf',node.target);
	
			if(flag){
				$('#catalog-children').menu('show',{
					left: e.pageX,
					top: e.pageY
				});
			}else{
				$('#catalog-parent').menu('show',{
					left: e.pageX,
					top: e.pageY
				});
			}	
		}else{
			$('#catalog-root').menu('show',{
				left: e.pageX,
				top: e.pageY
			});
		}
		},
		onBeforeEdit:function(node){
                beginText=node.text;
		},
		onAfterEdit:function(node){
			if(beginText!=node.text){
				//发送ajax请求更新目录
				$.post("catalog", { id: node.id,name:node.text });
			}
		}
	
	})
	
})

function remove(){

    var node = $('#catalog').tree('getSelected');

	if($('#catalog').tree('isLeaf',node.target)){
            removeNode(node);
	}else{
		//删除目录
		$.messager.confirm('提示','你确定要删除这个目录吗?',function(r){
			if(r){
                 removeNode(node);
			}
		});
	}
}




function edit(){
	
	var node = $('#catalog').tree('getSelected');
	
	$("#catalog").tree("beginEdit",node.target);
	
}


function appendKind(){
	
	$("#prompt").dialog({
		title:'添加种类',
	})
	$("#prompt").dialog('open')

}

function appendCatalog(){
	var node = $('#catalog').tree('getSelected');
	if(!node){
		$.messager.show({
			title:'提示',
			msg:'请选择目录',
			showType:'slide'
		});
	}else{
		$("#prompt").dialog({
			title:'添加目录',
		})
		
		$("#prompt").dialog('open')
	}
	
}

function addCatalog(){
	var node = $('#catalog').tree('getSelected');

	var nodeName = $("#catalogName").val().trim();
	
	if(!nodeName){
		$.messager.show({
			title:'提示',
			msg:'请输入要添加的名字',
			showType:'slide'
		});

	}else{
		//添加目录
		$("#prompt").dialog('close');
		
		var opration = $("#prompt").dialog('header')[0].innerText;
		var state;
		if(opration=="添加目录"){
			state = 1;
			$('#catalog').tree('append', {
				parent: (node?node.target:null),
				data: [{
					id:-1,
					text: nodeName,
					state:'closed',
				}]
			});
		}else{
			state = 0;
			$('#catalog').tree('append', {
				parent: (node?node.target:null),
				data: [{
					id:-1,
					text: nodeName,
					state:'open',
				}]
			});
		}

		//ajax添加目录
		$.ajax({
			url:'catalog',
			type:'put',
			data:{'fid':node.id,'name':nodeName,'state':state},
			success:function(nodeId){
				
				var addNode = $('#catalog').tree('find',-1);
				$('#catalog').tree('update',{
					target:addNode.target,
					 id:nodeId
				});
			}
		})
	}
	
}

function closePrompt(){
	$("#prompt").dialog('close');
}


//删除节点
function removeNode(node){
    var parent = $("#catalog").tree("getParent",node.target);

    var grandpa=$("#catalog").tree("getParent",parent.target);

    var childrens = $("#catalog").tree('getChildren',parent.target);

    $("#catalog").tree("remove",node.target);

    if(childrens.length==1){

        $("#catalog").tree("remove",parent.target);

        $("#catalog").tree("append",{
            parent:grandpa.target,
            data:[{
                id:parent.id,
                text:parent.text,
                state:'closed'
            }]
        });
    }

    //发送ajax请求删除节点
    $.ajax({
        url:'catalog/'+node.id,
        type:'delete',
        success:function(){

        }
    })
}




