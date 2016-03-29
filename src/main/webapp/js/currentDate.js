function getToDay() {
	var week =
	[ "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" ];
	var now = new Date();
	var nowYear = now.getFullYear();
	var nowMonth = now.getMonth()+1;
	var nowDate = now.getDate();
	var hour = now.getHours();
	var minute = now.getMinutes();
	var second = now.getSeconds();
	$("#date").val(
			"今天是：" + nowYear + "年" + nowMonth + "月" + nowDate + "日  "
					+ week[now.getDay()]);
//			+" "+hour+":"+minute+":"+second)
//	setInterval('getToDay()', 1000);
}