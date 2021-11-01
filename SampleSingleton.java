public class SampleSingleton {
	
	private static SampleSingleton instance = null;
	
	public static SampleSingleton getInstance() {
        if(instance==null){
            synchronized(instance){
                if(instance==null){
                    instance= new SampleSingleton();
                }
                return instance;
            }
        }
		return instance;
	}
	
}
