<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form method="post" action="savexml">
		<table id="root">
			<tr>
				<td>
					<table id="setchipMainMenu" border="0.1">
						<tr>
							<td>
								<p>
									<s:textfield label="version" name="setchipMainMenu.version" />
									<s:textfield label="gameandkeypanel"
										name="setchipMainMenu.gameandkeypanel" />
								</p>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			
			
		</table>
		<s:submit value="Save" align="left"/>
	</s:form>
</body>
</html>