package osdm2netex;

public class PublicationVersion {
	
	private static String version = null;
	
	private static PublicationVersion me = null;
	
	private PublicationVersion () {	}
	
	public static PublicationVersion getInstance() {
		if (me == null) {
			if (me == null) {
				me = new PublicationVersion();
			}
		}
		return me;
	}
	
	public void setVersion (String version) {
		PublicationVersion.version = version;
	}
	
	public static String getVersion() {
		return version;
	}

}
