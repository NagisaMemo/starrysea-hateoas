package top.starrysea.hateoas;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMethod;

public class Link {

	private String href;
	private RequestMethod method;
	private Map<String, Object> template;
	private RelType rel;

	Link(String href) {
		this(href, RequestMethod.GET);
	}

	Link(String href, RequestMethod method) {
		this(href, method, null);
	}

	Link(String href, RequestMethod method, Map<String, Object> template) {
		this(href, method, template, RelType.NEXT);
	}

	Link(String href, RequestMethod method, Map<String, Object> template, RelType rel) {
		this.href = href;
		this.method = method;
		this.template = template;
		this.rel = rel;
	}

	public String getHref() {
		return href;
	}

	public RequestMethod getMethod() {
		return method;
	}

	public Map<String, Object> getTemplate() {
		return template;
	}

	public RelType getRel() {
		return rel;
	}

}
