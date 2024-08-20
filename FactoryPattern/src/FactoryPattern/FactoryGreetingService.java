package FactoryPattern;

public class FactoryGreetingService {

	//returns an object of type Greeting Service

		public greetingservice getGreetingService(String lang) {

			if (lang== "english") {

				return (greetingservice) new English();

			}

			else if(lang == "french") {

				return (greetingservice) new French();

			}

			else

			{

				return null ;

			}

			

		}



	}

