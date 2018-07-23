package lv.rigacoding.todo;

public class ToDo {
	
	public ToDo (Long id, String content, boolean done) {
		this.id = id;
		this.content = content;
		this.done = done;
	}
	
	private Long id; //
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private String content; //
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	private boolean done; //

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	

}
