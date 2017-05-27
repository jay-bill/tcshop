<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
	<link rel="stylesheet" type="text/css" href="resources/css/easyui.css">
	<link rel="stylesheet" type="text/css" href="resources/css/icon.css">
	<link rel="stylesheet" type="text/css" href="resources/css/index.css">
	<script type="text/javascript" src="resources/js/jquery.min.js"> </script>
	<script type="text/javascript" src="resources/js/jquery.easyui.min.js"> </script>
	<script type="text/javascript" src="resources/js/easyui-lang-zh_CN.js"> </script>
	<script type="text/javascript" src="resources/js/index.js"></script>
	<script type="text/javascript" src="resources/js/catalog.js"></script>
</head>
<body>

   	<div id="layout" class="easyui-layout" data-options="fit:true">

	    <div id="title" data-options="region:'north',title:'图书后台管理系统',split:true,collapsible:false" style="height:25%" >
	   
	    </div>   

        <div data-options="region:'west',title:'图书信息维护平台',split:true" style="width:20%;">
  

	     <div id="catalog" style="fit:true;margin-left:5%;margin-top:1%">   
		   
		     

		</div> 

        </div>
        
	     <div id="content" data-options="region:'center',title:'内容管理',split:true" style="padding:75%;">
	    	
	    </div>  

	</div> 
	
	</div>
	


	菜单
   <div id="catalog-parent" class="easyui-menu" style="width:120px;">
		<div onclick="appendCatalog()" data-options="iconCls:'icon-add'">添加目录</div>
		<div onclick="appendKind()" data-options="iconCls:'icon-add'">添加种类</div>
		<div onclick="remove()" data-options="iconCls:'icon-remove'">删除目录</div>
        <div onclick="edit()" data-options="iconCls:'icon-edit'">编辑目录</div>
	</div>

	<div id="catalog-children" class="easyui-menu" style="width:120px;">
		<div onclick="remove()" data-options="iconCls:'icon-remove'">删除</div>
        <div onclick="edit()" data-options="iconCls:'icon-edit'">编辑</div>
	</div>

   <div id="catalog-root" class="easyui-menu" style="width:120px;">
		<div onclick="appendCatalog()" data-options="iconCls:'icon-add'">添加目录</div>
		<div onclick="appendKind()" data-options="iconCls:'icon-add'">添加种类</div>
	</div>

定义提示框
 
	<div id="prompt" class="easyui-dialog" style="width:300px;height:150px"
		data-options="buttons:'#bb',modal:true,buttons:'#bb',closed:true">
		<div style="padding-top:10%;padding-left:10%">
 	  	 <input type="text" id="catalogName" class="easyui-textbox" data-options="width:200,height:30,prompt:'输入要添加的名字'">
	   </div>
	</div>

	<div id="bb">
		<a href="#" class="easyui-linkbutton" onClick="addCatalog()">确定</a>
		<a href="#" class="easyui-linkbutton" onClick="closePrompt()">取消</a>
	</div>



</body>
</html>