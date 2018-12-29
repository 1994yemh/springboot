<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<style>
		.tablestyle{ border-collapse:collapse;width:1200px;font-size:14px;
		}
		.tablestyle th{  height:20px; border:1px solid #000; text-align:center;}
		.tablestyle td{  height:20px; border:1px solid #000; text-align:center;}
		.divleft{text-align:left}
		.field2_color{background-color:#EBF1DE}
	    .blue_color{background-color:#C5D9F1}
	    .inputStyle4{width:195px;height:100%;border:0px solid white;}
	    .inputStyle5{width:440px;height:100%;border:0px solid white;}
	    .inputStyle6{width:98px;height:100%;border:0px solid white;}
	</style>
</head>
<body>
   <table class="tablestyle">
				  <tr>
					<td width="200" class="field2_color">分公司：</td>
					<td width="200"><input type="text" class="inputStyle4" /></td>
					<td width="200"  class="field2_color">县市：</td>
					<td width="200"><input type="text" class="inputStyle4" /></td>
					<td width="200"  class="field2_color">商圈名/乡镇名/社区名：</td>
					<td width="200"><input type="text" class="inputStyle4" /></td>
				  </tr>
				  <tr>
					<td class="field2_color" >渠道单元名称:</td>
					<td ><input type="text" class="inputStyle4" /></td>
					<td class="field2_color">渠道单元编码:</td>
					<td ><input type="text" class="inputStyle4" /></td>
					<td class="field2_color">二级分类：</td>
					<td><input type="text" class="inputStyle4" /></td>
				  </tr>
				  <tr>
					<td  class="field2_color">渠道视图系统中开业时间：</td>
					<td ><input type="text" class="inputStyle4" /></td>
					<td  class="field2_color">是否全网通手机卖场：</td>
					<td ><input type="text" class="inputStyle4" /></td>
					<td  class="field2_color">店中商/销售点：</td>
					<td ><input type="text" class="inputStyle4" /></td>
				  </tr>
				  <tr>
					<td  class="field2_color">申请日期：</td>
					<td ><input type="text" class="inputStyle4" /></td>
					<td  class="field2_color">制表人：</td>
					<td ><input type="text" class="inputStyle4" /></td>
					<td  class="field2_color">联系电话： </td>
					<td ><input type="text" class="inputStyle4" /></td>
				  </tr>
				  <tr>
					<td  class="field2_color">区域</td>
					<td colspan="5"><input type="text" class="inputStyle4" /></td>
				  </tr>
          </table>
         <table class="tablestyle">
				  <tr>
					<td width="199" rowspan="2" class="field2_color">厅店投入产出情况（自建店以来）</td>
					<td  width="450"  class="field2_color">投入资源（装修补贴+租金补贴+运营补贴）</td>
					<td  width="450" class="field2_color">建店以来产生收入（新增套餐套餐值的和）</td>
					<td  width="101" class="field2_color">盈利情况</td>
				  </tr>
				  <tr>
				   
					<td  ><input type="text" class="inputStyle5" /></td>
					<td  ><input type="text" class="inputStyle5" /></td>
					<td  ><input type="text" class="inputStyle6" /></td>
				  </tr>
				  <tr class="blue_color">
					 <td colspan="4">
						 <div >  
										   网点退出后渠道覆盖情况调查
						 </div>
						 <div > 
						   (填表说明：如为社区门店，区域在小区1公里范围内)
						 </div>  
					 </td>
				   </tr>
				   <tr>
					<td rowspan="6"  class="field2_color">现有网点覆盖情况</td>
					<td   class="field2_color">电信</td>
					<td   class="field2_color">社会专营渠道网点数量</td>
					<td  ><input type="text" class="inputStyle6" /></td>
				  </tr>
				  <tr>
					<td   class="field2_color">移动</td>
					<td   class="field2_color">社会专营渠道网点数量</td>
					<td  ><input type="text" class="inputStyle6" /></td>
				  </tr>
				  <tr>
					<td   class="field2_color">联通</td>
					<td   class="field2_color">社会专营渠道网点数量</td>
					<td  ><input type="text" class="inputStyle6" /></td>
				  </tr>
				   <tr>
					<td   class="field2_color">电信</td>
					<td   class="field2_color">社会开放渠道网点数量</td>
					<td  ><input type="text" class="inputStyle6" /></td>
				  </tr>
				  <tr>
					<td   class="field2_color">移动</td>
					<td   class="field2_color">社会开放渠道网点数量</td>
					<td  ><input type="text" class="inputStyle6" /></td>
				  </tr>
				  <tr>
					<td   class="field2_color">联通</td>
					<td   class="field2_color">社会开放渠道网点数量</td>
					<td  ><input type="text" class="inputStyle6" /></td>
				  </tr>
				  <tr  class="field2_color">
					<td colspan="3">
					   <div >  
										 如为农村支局请填写支局收入（万元）
					   </div> 
					</td>
					<td></td>
				  </tr>
         </table>
		<table class="tablestyle">
				 <tr  class="field2_color">
					<td width="201" rowspan="7">网点近六个月运营情况</td>
					<td width="111">月份</td>
					<td width="111">销售情况（包括终端与基础业务销量）</td> 
					<td width="111">终端利润</td> 
					<td width="111">运营补贴</td>
					<td width="111">佣金</td> 
					<td width="111">房屋租金</td> 
					<td width="111">人员成本</td>
					<td width="111">其他成本</td> 
					<td width="111">盈利情况</td> 
				 </tr>
				 <tr>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
				 </tr>
				 <tr>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
				 </tr>
				 <tr>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
				 </tr>
				 <tr>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
				 </tr>
				 <tr>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
				 </tr>
				 <tr>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
					<td><input type="text" class="inputStyle6" /></td>
				 </tr>
				 <tr height="100">
					<td  class="field2_color">退出原因描述</td>
					<td colspan="9"><textarea type="text" style="width:100%;height:100%"></textarea></td>
				 </tr>
				 <tr height="70">
					<td  class="field2_color">下一步工作计划或举措</td>
					<td colspan="9"><textarea type="text" style="width:100%;height:100%"></textarea></td>
				 </tr>
				 <tr>
					<td  class="field2_color" >厅店装修费用（元）</td>
					<td ><input type="text" class="inputStyle6" /></td>
					<td   class="field2_color">房租补贴费用（元）</td>
					<td ><input type="text" class="inputStyle6" /></td>
					<td colspan="8"></td>
				 </tr>
         </table>
</body>
</html>