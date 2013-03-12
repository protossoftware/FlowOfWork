package de.protos.FlowOfWork.core.fow.generator

import de.protos.FlowOfWork.core.fow.foW.NamedElement
import com.google.inject.Singleton

@Singleton
class TextInfo{
	def getLabel(NamedElement element){
		if (element.textfield.label==null){
			return element.name
		}
		else {
			return element.textfield.label
		}
	}
//	def getDesctription(NamedElement element){
//		if (element.textfield.description==null){
//			return ""
//		}
//		else {
//			return element.textfield.description
//		}
//	}
	
}