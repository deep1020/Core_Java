public class checkDataType {

	public static void main(String[] args) {
		
		Object[] mixedObjects = new Object[]{"Hello", true, 1, new StringBuilder("Hello there"), new checkDataType(), new String[10]};

        for (Object item : mixedObjects) {
            System.out.println(item.getClass().getSimpleName());
        }
		
	}

}
