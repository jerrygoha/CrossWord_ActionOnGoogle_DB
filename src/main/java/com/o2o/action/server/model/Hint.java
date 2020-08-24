package com.o2o.action.server.model;
import javax.persistence.*;



@Entity
@Table(name = "hint")
public class Hint {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short hintSeq;

    @Column(name = "wordContent")
    private String wordContent;

    @Column(name = "hintPriority")
    private short hintPriority;

    @Column(name = "hintContent")
    private String hintContent;

    @Column(name = "useFlag", nullable = false)
    private boolean useFlag;

    protected Hint(){
    }

    public Hint(String wordContent, short hintPriority, String hintContent){
        this.wordContent = wordContent;
        this.hintContent = hintContent;
        this.hintPriority = hintPriority;
        this.useFlag = true;
    }

    public interface HintMapping{
        String getHintContent();
    }



    @Override
    public String toString() {
        return String.format("Hint[wordContent='%s', hintPriority='%s', hintContent='%s']", wordContent, hintPriority, hintContent );
    }

    public short getHintSeq() {
        return hintSeq;
    }
    public String getWordContent() {
        return wordContent;
    }
    public void setWordContent(String wordContent) {
        this.wordContent = wordContent;
    }
    public short getHintPriority() {
        return hintPriority;
    }
    public void setHintPriority(short hintPriority) {
        this.hintPriority = hintPriority;
    }
    public String getHintContent() {
        return hintContent;
    }
    public void setHintContent(String hintContent) {
        this.hintContent = hintContent;
    }

    public boolean getUseFlag() {
        return useFlag;
    }
    public void setUseFlag(boolean useFlag) {
        this.useFlag = useFlag;
    }

}