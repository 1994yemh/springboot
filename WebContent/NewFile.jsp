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
		.field_color{background-color:#EBF1DE}
		.white_color{background-color:white}
		.blue_color{background-color:#C5D9F1}
		.inputStyle{width:299px;height:100%;border:0px solid white;}
		.inputStyle2{width:80px;height:100%;border:0px solid white;text-align:center}
  </style>
</head>
  <body>
   <table class="tablestyle">
        <tr>
           <td width="106" class="field_color">分公司</td>
           <td width="300" ><input type="text" class="inputStyle" /></td>
           <td width="100" class="field_color">县市</td>
           <td width="300" ><input type="text" class="inputStyle" /></td>
           <td width="100" class="field_color"  >商圈名/乡镇名/社区名</td>
           <td width="300" ><input type="text" class="inputStyle" /></td>
        </tr>
    	
    	 <tr>
           <td width="100" class="field_color">地址</td>
           <td width="300" ><input type="text" class="inputStyle" /></td>
           <td width="100" class="field_color">制表人</td>
           <td width="300" ><input type="text" class="inputStyle" /></td>
           <td width="100" class="field_color">联系电话</td>
           <td width="300" ><input type="text" class="inputStyle" /></td>
         </tr>
          <tr>
           <td width="100" class="field_color">区域</td>
           <td width="100" colspan="5"></td>
         </tr>
      </table>
      <table class="tablestyle">
          <tr class="blue_color">
           <th width="100" >类别</th>
           <th width="100">分值</th>
           <th width="200" >评估指标</th>
           <th width="700" >计分规划</th>
           <th width="100">得分</th>
          </tr> 
          
          <tr class="field_color">
             <td rowspan="5">必备条件</td>
             <td>否决指标</td>
             <td>房地产权属和界址要清晰，预售证或房产证及土地证齐全</td> 
             <td rowspan="5">如果有一项不满足，则放弃选点</td> 
             <td class="white_color">
    		 </td>
          </tr>
          
           <tr class="field_color">
             <td>否决指标</td>
             <td>出租方在当地行业管理部门有不良记录</td> 
             <td class="white_color"><input type="text" class="inputStyle2" /></td>
          </tr>
          
           <tr class="field_color">
             <td>否决指标</td>
             <td>房屋结构不安全</td> 
             <td class="white_color"><input type="text" class="inputStyle2" /></td>
          </tr>
          
           <tr class="field_color" >
             <td>否决指标</td>
             <td>消防验收手续齐全</td> 
             <td class="white_color"><input type="text" class="inputStyle2" /></td>
          </tr>
          
           <tr class="field_color">
             <td>否决指标</td>
             <td>供电等物业满足使用需求</td> 
             <td class="white_color"><input type="text" class="inputStyle2" /></td>
          </tr>
          
          <tr class="field_color">
             <td rowspan="3">门店位置</td>
             <td>30</td>
             <td>营业厅位置</td> 
             <td >
	             <div class="divleft">
	               1、核心商圈和农村乡镇：位于该区域核心（繁华）路段内得30分，位于核心（繁华）边界或拐角得10分，周边无商业门店得0分
	             </div>
	             <div class="divleft">
	             2、社区门店：位于社区核心区域（小区100米内的街道上最佳）得30分，否则得10分
	             </div>
              </td> 
             <td class="white_color"><input type="text" class="inputStyle2" /></td>
          </tr>
          
           <tr class="field_color">
             <td>20</td>
             <td>周边异网门店覆盖情况</td> 
             <td>
	             <div class="divleft">
	                1、核心商圈：100m内有异网门店得20分，200m内有异网门店得10分，200m外得0分   
	             </div>
	             <div class="divleft">
	             2、农村乡镇：50m内有异网门店得20分，200m内有异网门店得10分，200m外得0分     
	             </div>
	             <div class="divleft">
	             3、城市社区：社区店不分析异网门店，得20分  
	             </div>
              </td> 
             <td class="white_color"><input type="text" class="inputStyle2" /></td>
          </tr>
          
          <tr class="field_color">
             <td>20</td>
             <td>商业环境</td> 
             <td >
	             <div class="divleft">
	                1、核心商圈：1公里内有大型商超、休闲广场得20分，有大型商超或休闲广场得10分，全无得5分  
	             </div>
	             <div class="divleft">
	               2、农村乡镇：300米内有商超、或有7家以上商业门店（农资商店除外）的得20分，300米内有商超、或4-7家商业门店（农资商店除外）的得10分，300米内无商超，或3家及以下商业门店得5分。
	             </div>
	             <div class="divleft">
	             3、社区门店：100米内有3家以上社区超市得20分、2家得10分，1家得5分，0家得0分。
	             </div>
	             <div class="divleft">
	             4、周边有生鲜市场等环境较差、气味较大物业0分
	             </div>
              </td> 
             <td class="white_color"><input type="text" class="inputStyle2" /></td>
          </tr>                                 
          
          <tr class="field_color">
             <td >人流量</td>
             <td>15</td>
             <td>门店侧道路高峰时段1小时人流量</td> 
             <td >
	             <div class="divleft">
	               1、核心商圈：大于100人15分，大于50人10分，大于30人5分，低于30人0分
	             </div>
	             <div class="divleft">
	               2、农村乡镇：大于50人15分，大于30人10分，大于10人5分，低于10人0分 
	             </div>
	             <div class="divleft">
	               3、城市社区：大于40人15分，大于30人10分，大于20人5分，低于20人0分
	             </div>
              </td> 
             <td class="white_color"><input type="text" class="inputStyle2" /></td>
          </tr>
          
          <tr class="field_color">
             <td rowspan="5">门店特点</td>
             <td>3</td>
             <td>店面所处楼层</td> 
             <td >
	             <div class="divleft">
	              	 平街得3分，其他楼层0分
	             </div>
              </td> 
             <td class="white_color"><input type="text" class="inputStyle2" /></td>
          </tr>
          
           <tr class="field_color">
             <td>3</td>
             <td>临街宽度</td> 
             <td>
	             <div class="divleft">
	               3米以上得3分，3米以下得0分
	             </div>
              </td> 
             <td class="white_color"><input type="text" class="inputStyle2" /></td>
          </tr>
          
          <tr class="field_color">
             <td>3</td>
             <td>店铺地面是否与路面平</td> 
             <td >
	             <div class="divleft">
	              	  平齐得3分，有台阶得0分
	             </div>
              </td> 
             <td class="white_color"><input type="text" class="inputStyle2" /></td>
          </tr>     
          
          <tr class="field_color">
             <td>3</td>
             <td>门口有适合做促销活动的区域</td> 
             <td >
	             <div class="divleft">
	              	 有得3分，无得0分
	             </div>
              </td> 
             <td class="white_color"><input type="text" class="inputStyle2" /></td>
          </tr > 
          
          <tr class="field_color">
             <td>3</td>
             <td>门面可视性</td> 
             <td >
	             <div class="divleft">
	              	 店面凹进，影响视线扣2分,有树木等摭挡物，或比邻商业经常性产生车辆临时摭挡门面扣1分
	             </div>
              </td> 
             <td class="white_color"><input type="text" class="inputStyle2" /></td>
          </tr> 
          
          <tr class="field_color">
             <td colspan="4">
                <div class="divleft">
	              	 <b>得分合计</b>（70分以上可建，70分以下原则上不建）
	             </div>
             </td>
             <td class="white_color"><input type="text" class="inputStyle2" /></td>
          </tr>
      </table> 
      <table class="tablestyle"> 
          <tr class="blue_color">
             <td colspan="5">
                <div >
	              	网点覆盖情况调查

	             </div>
	             <div >        
					（填表说明：如为社区门店，区域在小区1公里范围内）
	             </div>
             </td>
          </tr>
          
          <tr >
             <td width="100" rowspan="6" class="field_color">现有网点覆盖情况</td>
             <td width="100" class="field_color">电信</td>
             <td width="900" class="field_color">社会专营渠道网点数量</td>
             <td width="100"><input type="text" class="inputStyle2" /></td>
          </tr>
          
           <tr class="field_color">
             <td>移动</td>
             <td >社会专营渠道网点数量</td>
             <td class="white_color"><input type="text" class="inputStyle2" /></td>
          </tr >
          
           <tr class="field_color">
             <td>联通</td>
             <td >社会专营渠道网点数量</td>
             <td class="white_color"><input type="text" class="inputStyle2" /></td>
          </tr>
          
           <tr class="field_color">
             <td>电信</td>
             <td >社会开放渠道网点数量</td>
             <td class="white_color"><input type="text" class="inputStyle2" /></td>
          </tr>
          
           <tr class="field_color">
             <td>移动</td>
             <td >社会开放渠道网点数量</td>
             <td class="white_color"><input type="text" class="inputStyle2" /></td>
          </tr>
          
          <tr class="field_color">
             <td>联通</td>
             <td >社会开放渠道网点数量</td>
             <td class="white_color"><input type="text" class="inputStyle2" /></td>
          </tr>
          
          <tr class="field_color">
             <td colspan="3">
	             <div class="divleft">
		                           如为农村支局请填写支局收入（万元）
		         </div>
	         </td>  
	         <td class="white_color"><input type="text" class="inputStyle2" /></td>  
          </tr>
     </table>
</body>
</html>
<script>
function getparams(){
	//利用arguments来接受参数，arguments表示参数集合，
	//里面存放的调用这个方法所传递过来的所有参数的集合
	 var _q=arguments[0];//0位置表示q参数
	 var _a=arguments[1];//1位置表示a参数
	 var _b=arguments[2];//2位置表示b参数
	 var _c=arguments[3];//3位置表示c参数
	 var _d=arguments[4];//4位置表示d参数
	 alert(_q);
	 alert(_a);
	 alert(_b);
	 alert(_c);
	
	 alert(arguments.length);
	}
	getparams(1,2,3,4);

</script>