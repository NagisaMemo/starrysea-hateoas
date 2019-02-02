package top.starrysea.hateoas;

public enum RelType {

	PREV("prev"), NEXT("next");
	private String name;

	RelType(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
