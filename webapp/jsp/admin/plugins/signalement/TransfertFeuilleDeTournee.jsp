<%@ page import="fr.paris.lutece.portal.service.util.AppLogService"%>
<%@ page errorPage="../../ErrorPage.jsp"%>
<jsp:useBean id="exportFeuilleDeTournee" scope="session"
	class="fr.paris.lutece.plugins.dansmarue.web.ManageFeuilleDeTourneeJspBean" />
<%
  response.sendRedirect(exportFeuilleDeTournee.doTransfertPDF( request, response ));
%>
