package model;

public class Materia {

    private String materia;
    private String nota;
    private Aluno aluno;

    public Materia() {
    }

    public Materia(String materia, String nota, Aluno aluno) {
        this.materia = materia;
        this.nota = nota;
        this.aluno = aluno;
    }

    public String getMateria() {
        return materia;
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
        return "Materia{" + "materia=" + materia + ", nota=" + nota + ", aluno=" + aluno + '}';
    }

}
