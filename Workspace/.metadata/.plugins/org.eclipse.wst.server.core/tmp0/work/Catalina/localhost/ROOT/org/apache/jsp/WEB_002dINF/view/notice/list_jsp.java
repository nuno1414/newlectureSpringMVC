/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-02-22 02:26:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>코딩 전문가를 만들기 위한 온라인 강의 시스템</title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>공지사항목록</title>\n");
      out.write("    \n");
      out.write("    <link href=\"/css/customer/layout.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("    <style>\n");
      out.write("    \n");
      out.write("        #visual .content-container{	\n");
      out.write("            height:inherit;\n");
      out.write("            display:flex; \n");
      out.write("            align-items: center;\n");
      out.write("            \n");
      out.write("            background: url(\"../../images/customer/visual.png\") no-repeat center;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- header 부분 -->\n");
      out.write("\n");
      out.write("    <header id=\"header\">\n");
      out.write("        \n");
      out.write("        <div class=\"content-container\">\n");
      out.write("            <!-- ---------------------------<header>--------------------------------------- -->\n");
      out.write("\n");
      out.write("            <h1 id=\"logo\">\n");
      out.write("                <a href=\"/index.html\">\n");
      out.write("                    <img src=\"/images/logo.png\" alt=\"뉴렉처 온라인\" />\n");
      out.write("\n");
      out.write("                </a>\n");
      out.write("            </h1>\n");
      out.write("\n");
      out.write("            <section>\n");
      out.write("                <h1 class=\"hidden\">헤더</h1>\n");
      out.write("\n");
      out.write("                <nav id=\"main-menu\">\n");
      out.write("                    <h1>메인메뉴</h1>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"/guide\">학습가이드</a></li>\n");
      out.write("\n");
      out.write("                        <li><a href=\"/course\">강좌선택</a></li>\n");
      out.write("                        <li><a href=\"/answeris/index\">AnswerIs</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <div class=\"sub-menu\">\n");
      out.write("\n");
      out.write("                    <section id=\"search-form\">\n");
      out.write("                        <h1>강좌검색 폼</h1>\n");
      out.write("                        <form action=\"/course\">\n");
      out.write("                            <fieldset>\n");
      out.write("                                <legend>과정검색필드</legend>\n");
      out.write("                                <label>과정검색</label>\n");
      out.write("                                <input type=\"text\" name=\"q\" value=\"\" />\n");
      out.write("                                <input type=\"submit\" value=\"검색\" />\n");
      out.write("                            </fieldset>\n");
      out.write("                        </form>\n");
      out.write("                    </section>\n");
      out.write("\n");
      out.write("                    <nav id=\"acount-menu\">\n");
      out.write("                        <h1 class=\"hidden\">회원메뉴</h1>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"/index.html\">HOME</a></li>\n");
      out.write("                            <li><a href=\"/member/login.html\">로그인</a></li>\n");
      out.write("                            <li><a href=\"/member/agree.html\">회원가입</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("\n");
      out.write("                    <nav id=\"member-menu\" class=\"linear-layout\">\n");
      out.write("                        <h1 class=\"hidden\">고객메뉴</h1>\n");
      out.write("                        <ul class=\"linear-layout\">\n");
      out.write("                            <li><a href=\"/member/home\"><img src=\"/images/txt-mypage.png\" alt=\"마이페이지\" /></a></li>\n");
      out.write("                            <li><a href=\"/notice/list.html\"><img src=\"/images/txt-customer.png\" alt=\"고객센터\" /></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("	<!-- --------------------------- <visual> --------------------------------------- -->\n");
      out.write("	<!-- visual 부분 -->\n");
      out.write("	\n");
      out.write("	<div id=\"visual\">\n");
      out.write("		<div class=\"content-container\"></div>\n");
      out.write("	</div>\n");
      out.write("	<!-- --------------------------- <body> --------------------------------------- -->\n");
      out.write("	<div id=\"body\">\n");
      out.write("		<div class=\"content-container clearfix\">\n");
      out.write("\n");
      out.write("			<!-- --------------------------- aside --------------------------------------- -->\n");
      out.write("			<!-- aside 부분 -->\n");
      out.write("\n");
      out.write("\n");
      out.write("			<aside class=\"aside\">\n");
      out.write("				<h1>고객센터</h1>\n");
      out.write("\n");
      out.write("				<nav class=\"menu text-menu first margin-top\">\n");
      out.write("					<h1>고객센터메뉴</h1>\n");
      out.write("					<ul>\n");
      out.write("						<li><a class=\"current\"  href=\"/customer/notice\">공지사항</a></li>\n");
      out.write("						<li><a class=\"\"  href=\"/customer/faq\">자주하는 질문</a></li>\n");
      out.write("						<li><a class=\"\" href=\"/customer/question\">수강문의</a></li>\n");
      out.write("						<li><a class=\"\" href=\"/customer/event\">이벤트</a></li>\n");
      out.write("						\n");
      out.write("					</ul>\n");
      out.write("				</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("	<nav class=\"menu\">\n");
      out.write("		<h1>협력업체</h1>\n");
      out.write("		<ul>\n");
      out.write("			<li><a target=\"_blank\" href=\"http://www.notepubs.com\"><img src=\"/images/notepubs.png\" alt=\"노트펍스\" /></a></li>\n");
      out.write("			<li><a target=\"_blank\" href=\"http://www.namoolab.com\"><img src=\"/images/namoolab.png\" alt=\"나무랩연구소\" /></a></li>\n");
      out.write("						\n");
      out.write("		</ul>\n");
      out.write("	</nav>\n");
      out.write("					\n");
      out.write("			</aside>\n");
      out.write("			<!-- --------------------------- main --------------------------------------- -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("		<main class=\"main\">\n");
      out.write("			<h2 class=\"main title\">공지사항</h2>\n");
      out.write("			\n");
      out.write("			<div class=\"breadcrumb\">\n");
      out.write("				<h3 class=\"hidden\">경로</h3>\n");
      out.write("				<ul>\n");
      out.write("					<li>home</li>\n");
      out.write("					<li>고객센터</li>\n");
      out.write("					<li>공지사항</li>\n");
      out.write("				</ul>\n");
      out.write("			</div>\n");
      out.write("			\n");
      out.write("			<div class=\"search-form margin-top first align-right\">\n");
      out.write("				<h3 class=\"hidden\">공지사항 검색폼</h3>\n");
      out.write("				<form class=\"table-form\">\n");
      out.write("					<fieldset>\n");
      out.write("						<legend class=\"hidden\">공지사항 검색 필드</legend>\n");
      out.write("						<label class=\"hidden\">검색분류</label>\n");
      out.write("						<select name=\"f\">\n");
      out.write("							<option  value=\"title\">제목</option>\n");
      out.write("							<option  value=\"writerId\">작성자</option>\n");
      out.write("						</select> \n");
      out.write("						<label class=\"hidden\">검색어</label>\n");
      out.write("						<input type=\"text\" name=\"q\" value=\"\"/>\n");
      out.write("						<input class=\"btn btn-search\" type=\"submit\" value=\"검색\" />\n");
      out.write("					</fieldset>\n");
      out.write("				</form>\n");
      out.write("			</div>\n");
      out.write("			\n");
      out.write("			<div class=\"notice margin-top\">\n");
      out.write("				<h3 class=\"hidden\">공지사항 목록</h3>\n");
      out.write("				<table class=\"table\">\n");
      out.write("					<thead>\n");
      out.write("						<tr>\n");
      out.write("							<th class=\"w60\">번호</th>\n");
      out.write("							<th class=\"expand\">제목</th>\n");
      out.write("							<th class=\"w100\">작성자</th>\n");
      out.write("							<th class=\"w100\">작성일</th>\n");
      out.write("							<th class=\"w60\">조회수</th>\n");
      out.write("						</tr>\n");
      out.write("					</thead>\n");
      out.write("					<tbody>\n");
      out.write("							\n");
      out.write("					<tr>\n");
      out.write("						<td>8</td>\n");
      out.write("						<td class=\"title indent text-align-left\"><a href=\"/notice/detail\">스프링 8강까지의 예제 코드</a></td>\n");
      out.write("						<td>newlec</td>\n");
      out.write("						<td>\n");
      out.write("							2019-08-18		\n");
      out.write("						</td>\n");
      out.write("						<td>146</td>\n");
      out.write("					</tr>\n");
      out.write("							\n");
      out.write("					<tr>\n");
      out.write("						<td>7</td>\n");
      out.write("						<td class=\"title indent text-align-left\"><a href=\"/notice/detail\">스프링 DI 예제 코드</a></td>\n");
      out.write("						<td>newlec</td>\n");
      out.write("						<td>\n");
      out.write("							2019-08-15		\n");
      out.write("						</td>\n");
      out.write("						<td>131</td>\n");
      out.write("					</tr>\n");
      out.write("							\n");
      out.write("					<tr>\n");
      out.write("						<td>6</td>\n");
      out.write("						<td class=\"title indent text-align-left\"><a href=\"/notice/detail\">뉴렉쌤 9월 초 국기과정 모집 안내</a></td>\n");
      out.write("						<td>newlec</td>\n");
      out.write("						<td>\n");
      out.write("							2019-06-11		\n");
      out.write("						</td>\n");
      out.write("						<td>517</td>\n");
      out.write("					</tr>\n");
      out.write("							\n");
      out.write("					<tr>\n");
      out.write("						<td>5</td>\n");
      out.write("						<td class=\"title indent text-align-left\"><a href=\"/notice/detail\">뉴렉처 강의 수강 방식 안내</a></td>\n");
      out.write("						<td>newlec</td>\n");
      out.write("						<td>\n");
      out.write("							2019-05-24		\n");
      out.write("						</td>\n");
      out.write("						<td>448</td>\n");
      out.write("					</tr>\n");
      out.write("							\n");
      out.write("					<tr>\n");
      out.write("						<td>4</td>\n");
      out.write("						<td class=\"title indent text-align-left\"><a href=\"/notice/detail\">자바 구조적인 프로그래밍 강의 예제 파일</a></td>\n");
      out.write("						<td>newlec</td>\n");
      out.write("						<td>\n");
      out.write("							2019-04-24		\n");
      out.write("						</td>\n");
      out.write("						<td>520</td>\n");
      out.write("					</tr>\n");
      out.write("					\n");
      out.write("					\n");
      out.write("					</tbody>\n");
      out.write("				</table>\n");
      out.write("			</div>\n");
      out.write("			\n");
      out.write("			<div class=\"indexer margin-top align-right\">\n");
      out.write("				<h3 class=\"hidden\">현재 페이지</h3>\n");
      out.write("				<div><span class=\"text-orange text-strong\">1</span> / 1 pages</div>\n");
      out.write("			</div>\n");
      out.write("\n");
      out.write("			<div class=\"margin-top align-center pager\">	\n");
      out.write("		\n");
      out.write("	<div>\n");
      out.write("		\n");
      out.write("		\n");
      out.write("		<span class=\"btn btn-prev\" onclick=\"alert('이전 페이지가 없습니다.');\">이전</span>\n");
      out.write("		\n");
      out.write("	</div>\n");
      out.write("	<ul class=\"-list- center\">\n");
      out.write("		<li><a class=\"-text- orange bold\" href=\"?p=1&t=&q=\" >1</a></li>\n");
      out.write("				\n");
      out.write("	</ul>\n");
      out.write("	<div>\n");
      out.write("		\n");
      out.write("		\n");
      out.write("			<span class=\"btn btn-next\" onclick=\"alert('다음 페이지가 없습니다.');\">다음</span>\n");
      out.write("		\n");
      out.write("	</div>\n");
      out.write("	\n");
      out.write("			</div>\n");
      out.write("		</main>\n");
      out.write("		\n");
      out.write("			\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("    <!-- ------------------- <footer> --------------------------------------- -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <footer id=\"footer\">\n");
      out.write("            <div class=\"content-container\">\n");
      out.write("                <h2 id=\"footer-logo\"><img src=\"/images/logo-footer.png\" alt=\"회사정보\"></h2>\n");
      out.write("    \n");
      out.write("                <div id=\"company-info\">\n");
      out.write("                    <dl>\n");
      out.write("                        <dt>주소:</dt>\n");
      out.write("                        <dd>서울특별시 </dd>\n");
      out.write("                        <dt>관리자메일:</dt>\n");
      out.write("                        <dd>admin@newlecture.com</dd>\n");
      out.write("                    </dl>\n");
      out.write("                    <dl>\n");
      out.write("                        <dt>사업자 등록번호:</dt>\n");
      out.write("                        <dd>111-11-11111</dd>\n");
      out.write("                        <dt>통신 판매업:</dt>\n");
      out.write("                        <dd>신고제 1111 호</dd>\n");
      out.write("                    </dl>\n");
      out.write("                    <dl>\n");
      out.write("                        <dt>상호:</dt>\n");
      out.write("                        <dd>뉴렉처</dd>\n");
      out.write("                        <dt>대표:</dt>\n");
      out.write("                        <dd>홍길동</dd>\n");
      out.write("                        <dt>전화번호:</dt>\n");
      out.write("                        <dd>111-1111-1111</dd>\n");
      out.write("                    </dl>\n");
      out.write("                    <div id=\"copyright\" class=\"margin-top\">Copyright ⓒ newlecture.com 2012-2014 All Right Reserved.\n");
      out.write("                        Contact admin@newlecture.com for more information</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    </html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
