public interface Queue<T>
{
    void add (T item);
	// Remove front item, if queue is empty return null
    T remove ();
    boolean isEmpty ();
    
}
