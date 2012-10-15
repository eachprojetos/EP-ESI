package ep.esi

class Paciente {
	
	String nome
	String telefone

    static constraints = {
		nome(blank:false)
		telefone(blank:false, nullable:false, maxSize:10)
    }
}
