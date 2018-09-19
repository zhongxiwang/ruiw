
(function() {

	var factory = function (exports) {

		var $            = jQuery;
		var pluginName   = "docinfo";

		exports.fn.downloadDialog = function() {
			var _this       = this;
			var lang        = this.lang;
			var editor      = this.editor;
			var settings    = this.settings;
			var path        = settings.pluginPath + pluginName + "/";
			var classPrefix = this.classPrefix;
			var dialogName  = classPrefix + pluginName, dialog;
			var tmp="http://localhost:889/Menum?id=0";
			$.ajax({
				url:tmp,
				type:"GET",
				success:function(data){
					var opts="<select>";
					for(var i=0;i<data.length;i++){
						
						var opt='<option value="'+data[i].id+'">'+data[i].menumName+'</option>';
						opts+=opt;
					}
					opts+="</select>";
				}
			});
			
			if (editor.find("." + dialogName).length < 1)
			{	
				var cont= '<div class="editormd-form"><label>标题</label><input type="text" value="" data-name=""><br><label>链接ID</label><input type="text" data-url-id=""><br><label>链接地址</label><input type="text" value="http://" data-url=""><br><label>链接标题</label><input type="text" value="" data-title=""><br></div>';	
				var dialogContent = "<div class=\"markdown-body\" style=\"font-family:微软雅黑, Helvetica, Tahoma, STXihei,Arial;height:210px;overflow:auto;font-size:14px;border-bottom:1px solid #ddd;padding:0 20px 20px 0;\">"+cont+"</div>";
				dialog = this.createDialog({
					name       : dialogName,
					title      : "document information",
					width      : 440,
					height     : 340,
					mask       : settings.dialogShowMask,
					drag       : settings.dialogDraggable,
					content    : dialogContent,
					lockScreen : settings.dialogLockScreen,
					maskStyle  : {
						opacity         : settings.dialogMaskOpacity,
						backgroundColor : settings.dialogMaskBgColor
					},
					buttons    : {
						close : [lang.buttons.close, function() {      
							this.hide().lockScreen(false).hideMask();
							
							return false;
						}],
						save:["save",function(){
                            alert("Save");
                            return true;
						}]
					}
				});
			}
			dialog = editor.find("." + dialogName);

			this.dialogShowMask(dialog);
			this.dialogLockScreen();
			dialog.show();

			var helpContent = dialog.find(".markdown-body");

            dialog.find("." + classPrefix + "dialog-close").bind(editormd.mouseOrTouch("click", "touchend"), function() {
                helpContent.html("");
                return this;
            });
		};

	};
    
	// CommonJS/Node.js
	if (typeof require === "function" && typeof exports === "object" && typeof module === "object")
    { 
        module.exports = factory;
    }
	else if (typeof define === "function")  // AMD/CMD/Sea.js
    {
		if (define.amd) { // for Require.js

			define(["editormd"], function(editormd) {
                factory(editormd);
            });

		} else { // for Sea.js
			define(function(require) {
                var editormd = require("./../../editormd");
                factory(editormd);
            });
		}
	} 
	else
	{
        factory(window.editormd);
	}

})();
function getUrlParam(k) {
    var regExp = new RegExp('([?]|&)' + k + '=([^&]*)(&|$)');
    var result = window.location.href.match(regExp);
    if (result) {
        return decodeURIComponent(result[2]);
    } else {
        return null;
    }
}

function init()
{
	var tmp="http://localhost:889/Menum?id=0";
	$.ajax({
		url:tmp,
		type:"GET",
		success:function(data){
			var opts="<select>";
			for(var i=0;i<data.length;i++){
				
				var opt='<option value="'+data[i].id+'">'+data[i].menumName+'</option>';
				opts+=opt;
			}
			opts+="</select>";
		}
	});
}