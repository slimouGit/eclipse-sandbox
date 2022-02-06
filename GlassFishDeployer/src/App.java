import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class App {
	
	static String sourceDirectory = "F:/git_repo/eclipse-sandbox/DummyJSF/target/";
	static String sourceName = "DummyJSF-0.0.1-SNAPSHOT.war";
	static String targetName = "DummyJSF.war";
	
	public static void main(String[] args) {		
		FileConfigurator fileConfigurator = new FileConfigurator(sourceDirectory, sourceName, targetName);
		fileConfigurator.generatePath();		
		prepareTargetDirectory(fileConfigurator);
		copyFilesToTargetDirectory(fileConfigurator);		
	}

	private static void prepareTargetDirectory(FileConfigurator fileConfigurator) {
	      File file = new File(fileConfigurator.getTargetDirectory());
	      deleteFiles(file);
	      System.out.println("Files deleted........");		
	}

	private static void deleteFiles(File dirPath) {
		File filesList[] = dirPath.listFiles();
	      for(File file : filesList) {
	         if(file.isFile()) {
	            file.delete();
	         } else {
	            deleteFiles(file);
	         }
	      }
		
	}
	
	private static void copyFilesToTargetDirectory(FileConfigurator fileConfigurator) {
		try{		
		    Files.copy(fileConfigurator.getSource(), fileConfigurator.getTarget());
		    System.out.println("Files copied........");	
		  } catch (IOException e) {
		    e.printStackTrace();
		  }		
	}

}
