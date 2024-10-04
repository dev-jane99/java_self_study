package optionalTest;

import java.util.Objects;

public class User {
	private Long id;
	private String name;
	private String userId;
	private String password;
	private static Long seq;
	
	static {
		seq = 0L;
	}
	
	{
		this.id = seq++; //아이디는 자동 증가한다
	}
	
	public User() {;}

	public User(String name, String userId, String password) {  //그래서 여기 생성자에서는 필요없는것이다. 아이디가.
		this.name = name;
		this.userId = userId;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static Long getSeq() {
		return seq;
	}

	public static void setSeq(Long seq) {
		User.seq = seq;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
}
