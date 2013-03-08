
package de.protos.FlowOfWork.core.fow;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FoWStandaloneSetup extends FoWStandaloneSetupGenerated{

	public static void doSetup() {
		new FoWStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

