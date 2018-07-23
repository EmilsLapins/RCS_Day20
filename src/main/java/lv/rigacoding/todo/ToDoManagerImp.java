package lv.rigacoding.todo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.util.SocketUtils;

public class ToDoManagerImp implements ToDoManager {

	private HashMap<Long, ToDo> todos;
	private Long idCounter = 0L;
	
	public ToDoManagerImp() {
		todos = new HashMap<Long, ToDo>();
	}
	
	@Override
	public List<ToDo> getAll() {
		// TODO Auto-generated method stub
		return new ArrayList<ToDo>(todos.values());
	}

	@Override
	public ToDo getById(Long id) {
		ToDo result = todos.get(id);
		return result;
	}

	@Override
	public Long add(String content, boolean done) {
		idCounter++;
		ToDo todo = new ToDo(idCounter, content, done);
		todos.put(idCounter, todo);
		return idCounter;
	}

	@Override
	public void remove(Long id) {
		todos.remove(id);
		
	}

	@Override
	public void update(Long id, String content, boolean done) {
		
		ToDo todo = todos.get(id);
		todo.setContent(content);
		todo.setDone(done);
		
	}

}
