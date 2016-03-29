/**
 * 打开 dialog
 * @param dialogName
 */
function openDialog(dialogName){
	PF(dialogName).show();
}

/**
 * 关闭dialog
 * @param dialogName
 */
function closeDialog(dialogName){
	PF(dialogName).hide();
}


function setScreenWidthAndHeight(){
	var width = screen.width;
	var height = screen.height;
	setscreen([ {
		name : 'width',
		value : width
	}, {
		name : 'height',
		value : height
	} ]);
}