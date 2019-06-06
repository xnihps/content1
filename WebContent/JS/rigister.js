/**
 * 
 */
function ValidateForm(thisForm){
				with(thisForm){
					if(username.value==""){
						alert("账号不可以为空");
						return false;
					}
					if(password.value.length<6 || password.value.length>20){
						alert("用户口令必须在6~20之间");
						return false;
					} 
					if(confirmpwd.value!=password.value){
						alert("两次口令必须一致")
						return false;
					}else{
						alert("注册成功");
						return true;
					}
				}
				
}
