public class Init{
	{
				System.out.println("Init init");
		
	}
	static{
				System.out.println("Init static init");	
		
	}
		public static void main(String[] args){
			new Mid();
			
		}
		
		static class Top{
		
			{
				System.out.println("Top init");
			}
			
			static{
				System.out.println("Top static init");
			}
		}
		static class Mid extends Top{
		
			{
				System.out.println("Mid init");
			}
			static{
				System.out.println("Mid static init");
			}
		}

}