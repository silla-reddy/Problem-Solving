package providesAnnotation;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
class TextEditorModule extends AbstractModule {
	   @Override
	   protected void configure() {} 

	   @Provides
	   public SpellChecker provideSpellChecker() {
	      String dbUrl = "jdbc:mysql://localhost:5326/emp";
	      String user = "user";
	      int timeout = 100;

	      SpellChecker SpellChecker = new SpellCheckerImpl(dbUrl, user, timeout);
	      return SpellChecker;
	   }
	   
	   @Provides
	   @Named("arg1")
	   public SpellChecker provideSpellChecker1() {
		      String dbUrl = "jdbc:mysql://localhost:5326/emp";
		      String user = "user";
		      int timeout = 100;

		      SpellChecker SpellChecker = new SpellCheckerImpl(dbUrl, user, timeout);
		      return SpellChecker;
		   }
	   
	}