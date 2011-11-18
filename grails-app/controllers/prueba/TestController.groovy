package prueba

class TestController {
	
	def index = {
		
		
		Element element = new Element(name:"element1")
		element.addToSubElements(new SubElement(name:"subElement"))
		element.save()
		
		element.delete()
		render element
		
		
	}

}
