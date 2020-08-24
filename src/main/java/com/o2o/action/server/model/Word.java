package com.o2o.action.server.model;

import javax.persistence.*;

@Entity
@Table(name = "word")
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short wordSeq;

    @Column(name = "stageDifficulty")
    private String stageDifficulty;

    @Column(name = "wordContent")
    private String wordContent;

    //@Column(name = "use_flag", nullable = false, columnDefinition = "default 'true'")
    @Column(name = "useFlag", nullable = false)
    private boolean useFlag;

    public Word(String stageDifficulty, String wordContent) {
        this.stageDifficulty = stageDifficulty;
        this.wordContent = wordContent;
        this.useFlag = true;
    }

    public interface wordMapping{
        String wordContent();
    }

    protected Word(){

    }


    public short getWordSeq() {
        return wordSeq;
    }
    public void setWordSeq(short wordSeq) {
        this.wordSeq = wordSeq;
    }
    public String getStageDifficulty() {
        return stageDifficulty;
    }

    public void setStageDifficulty(String stageDifficulty) {
        this.stageDifficulty = stageDifficulty;
    }

    public String getWordContent() {
        return wordContent;
    }

    public void setWordContent(String word_content) {
        this.wordContent = wordContent;
    }

}
