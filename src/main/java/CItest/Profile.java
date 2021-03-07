package CItest;
import java.util.ArrayList;
import java.util.List;



public class Profile {
	private String name = "リロイ・ジェンキンス";
	private String name2 = "リロォォォォイ";
	private List<String> tags = new ArrayList<>();

	public String getName() {
		return name;
	}

	public String getName2() {
		return name2;
	}

	public void addTag(String tag) {
		this.tags.add(tag);
	}
}
