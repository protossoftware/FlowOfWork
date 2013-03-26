package de.protos.FlowOfWork.core.fow.generator

import de.protos.FlowOfWork.core.fow.foW.Activity
import org.eclipse.emf.common.util.EList

import static de.protos.FlowOfWork.core.fow.generator.MetamodelHelpers.*

class MetamodelHelpers {
	def static hasBehavior(Activity activity){
		return !emptyList(activity.steps)
	}
	def static emptyList(EList list){
		if (list == null)
			return true
		else if (list.empty)
			return true
		else
			return false
	}
	
}