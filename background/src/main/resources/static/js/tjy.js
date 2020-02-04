function cnmd(){
			nimabide();
}

function nimabide(){	//生成详情		
			$("[name=goodskc] tbody").html("");
			var kc=$("[name=goodkuchun]").val();
			if(kc==""){
				kc=0;
			}
			var kc=0;
			var t=0;
			$("#tab_none tbody tr").each(function(){
				var yanshe=$(this).find("input").eq(1).val();
				if(yanshe!=""){
					$.each($("[name=chimaya] a"),function(a,b){					
						if($(b).attr("name")=="noundefined"){
							var shuijima="";
							/*for(var i=0;i<12;i++){
								var j=parseInt(Math.random()*10);
								if(i==0&&j==0){
									j++;
								}
								shuijima+=j;
							}*/
							 t++;
							//alert(t);
							
							$.ajax({
								url:"/spscha/tiaoxinma?t="+t,
								success:function(reulte){
									 //alert(reulte)
									shuijima=reulte
									$("[name=goodskc] tbody").append("<tr>"+
																		"<td>"+
																			"<span name='colors'>"+yanshe+"</span>"+
																			"<span>——</span>"+
																			"<span name='ziesw'>"+$(b).html()+"</span>"+
																		 "</td>"+
																		 "<td style='width:70px; height: 20px;'>"+
																		 	"<input name='lwl' value='"+kc+"' oninput='suanshu()' style='width:100%; height:100%;'>"+	
																		 "</td>"+
																		 "<td name='tiaoxinmas'>"+shuijima+"</td>"+
																	"</tr>");	
								 }
							})
						}
						})
				}
			})
		
		}



		$("#shopgoods").mouseover(function(){//鼠标放在标签上给他一个name
			$("[name=chimaya] a").unbind("click");
			niubi();
		})
		
			function niubi(){

			$("[name=chimaya] a").click(function(){		
				if($(this).attr("name")=="noundefined"){
					$(this).attr("name","undefined");
					//alert(1)
					/*$(this).attr("style","color:black");*/
					$(this).attr("style","border:1px solid #e2e1e3")
					nimabide();
				}else{
					//alert(1)
					$(this).attr("style","border:1px solid red")
					$(this).attr("name","noundefined");
						nimabide();
					}
			
		
			})
		
			}


$("[name=colorbao] input").click(function(){//选中商品颜色	
					var color=$(this).next().find("span").eq(0).attr("style");
					var colorname=$(this).next().find("span").eq(1).html();
					
					if($(this).attr("checked")=="checked"){
						$(this).removeAttr("checked");
						var index=0;
						$("#tab_none tbody tr").each(function(a,b){					
							index+=a;
						})
						$("#tab_none tbody tr").each(function(a,b){
							var yanshe=$(b).find("input").eq(1).val();						
							if(colorname==yanshe){	
								$(b).remove();
								
							}
						})
						
						if(index==0){
							$("#tab_none").hide();
						}
						nimabide();
					}else{
						$("#tab_none tbody").append(`
								<tr>
															<td>
																<span style="margin-left: 4px;">1</span>
																<span>.</span>
																<span style="margin-left: 4px;"><input type="checkbox" /></span>
																<span style="display: inline-block;margin-left: 4px;width: 50%;"><input type="text" onblur="cnmd()" class="form-control" placeholder="请输入颜色" value="${colorname}"  /></span>
																<span style="margin-left: 9px;" onclick="yichu(this)">X</span>
															</td>
															<td>
																<span style="display: inline-block;width: 50%"><input style="${color}" type="text" class="form-control" disabled="disabled" /></span>
																<span><button type="button" class="btn btn-primary active">上传图片</button></span>
															</td>
														</tr>
							`);
						$("#tab_none").show();
						$(this).attr("checked","checked");
						nimabide();
					}
				})
				
$("#addColor").click(function(){//新增商品颜色
			$("#tab_none tbody").append(`
				<tr>
				    <td>
						<span style="margin-left: 4px;">1</span>
						<span>.</span>
						<span style="margin-left: 4px;"><input type="checkbox" /></span>
						<span style="display: inline-block;margin-left: 4px;width: 50%;"><input type="text" onblur="cnmd()" class="form-control" placeholder="请输入颜色"  /></span>
						<span style="margin-left: 9px;"  onclick="yichu(this)">X</span>
					</td>
					<td>
						<span style="display: inline-block;width: 50%"><input type="text" class="form-control" disabled="disabled" /></span>
						<span><button type="button" class="btn btn-primary active">上传图片</button></span>
					</td>
			   </tr>							
			`);
$("#tab_none").show();
});


function yichu(a){//删除
	
	var tr = $(a).parent().parent();
	var inpu=tr.find("input").eq(1).val();
	$("[name=colorbao] input").each(function(a,b){
	
		if($(b).next().find("span").eq(1).html()==inpu){
			$(this).removeAttr("checked");
		}
	})
	var index=0;
	$("#tab_none tbody tr").each(function(a,b){					
		index+=a;
	})
	tr.remove();
	if(index==0){
		$("#tab_none").hide();
	}
	nimabide();
}




function sc(a){//删除尺码
	var name=$(a).prev().html();
	$(a).parent().remove();
	nimabide();
}

function enen(){//编辑尺码
	var name=$("[name=bjcm]").html();
	if(name=="编辑尺码"){
		$("[name=chima]").show();
	$("#fpsizes").append(`
		<li><input name="lw" style="width: 96px; height: 38px;"></li>
	`);
	$("[name=bjcm]").html("保存修改");
	$("[name=chimaya] a").unbind("click");
	niubi();
	}else{
		var nima=$("[name=lw]").val();
		$(".fpsize input").parent().remove();
		$("[name=bjcm]").html("编辑尺码");
		if(nima!=""){
		//$("#fpsizes").append("<li><a href='javascript:;'>"++"</a><span style='float: right;' name='chima' class='glyphicon glyphicon-remove' onclick='sc(this)'></span></li>");
		$("#fpsizes").append("<li>"+
								"<div class='row' style='margin: 0 2px'>"+
									"<a href='javascript:void(0);'  class='col-sm-8 abq' >"+nima+"</a>"+
									"<a href='javascript:void(0);' style='float: right;display: none;width: 20px;height: 20px;line-height: 12px;margin-top: 10px;margin-left:5px;border-radius: 10px;' name='chima' class='col-sm-4' @click='del(stu.goodsizeid)' onclick='sc(this)'>X</a>"+
								"</div>"
							+"</li>");
		$("[name=chimaya] a").unbind("click");
		niubi();
		}
		$("[name=chima]").hide();
	}
	
}



