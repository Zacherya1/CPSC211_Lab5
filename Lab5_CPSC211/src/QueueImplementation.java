import java.util.ArrayList;

public class QueueImplementation<T> implements Queue<T>
{
	
	//make array list
	ArrayList<T> list = new ArrayList<T>();
	
	@Override
	public void add(T item) {
		//add to array list
		list.add(item);
	}
	

	@Override
	public T remove() {
		//remove from array list
		T item = null;
		if (list.isEmpty() == false)
		{
			item = list.get(0);
			list.remove(0);
			return item;
		}
		else
		{
			return item;
		}
		
	}

	@Override
	public boolean isEmpty() {
		if (list.isEmpty() == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
