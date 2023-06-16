package model;

public class Materia {
    
    private int id;
    private String materia;
    private String nota;
    private Aluno aluno;

    public Materia() {
    }

    public Materia(int id, String materia, String nota, Aluno aluno) {
        this.id = id;
        this.materia = materia;
        this.nota = nota;
        this.aluno = aluno;
    }

    

    public String getMateria() {
        return materia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "Materia{" + "id=" + id + ", materia=" + materia + ", nota=" + nota + ", aluno=" + aluno + '}';
    }

    

}
