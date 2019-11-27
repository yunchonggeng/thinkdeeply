package tmp;

import java.util.List;

public interface Sink<T>{
   public void flush(T t);
}
