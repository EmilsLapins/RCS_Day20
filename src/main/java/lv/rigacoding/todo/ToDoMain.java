package lv.rigacoding.todo;

public class ToDoMain {

	public static void main(String[] args) {
		ToDoManagerImp manager = new ToDoManagerImp();
		Long id1 = manager.add("Test TODO", false);
		Long id2 = manager.add("Another test", true);
		
		ToDo todo1 = manager.getById(id1);
		
		System.out.println(todo1);
		System.out.println(manager.getAll());
		manager.remove(id1);
		manager.update(id2, "Updated content", true);
		
		System.out.println(manager.getAll());

	}

}
