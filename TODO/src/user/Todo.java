/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;
import java.time.LocalDate;
import dao.LoginDao;

public class Todo {

    private Long id;
    private String title;
    private String description;
    private LocalDate targetDate;
    private boolean status;
    private int fid;

    protected Todo() {

    }

    public Todo(long id, String title, String description, LocalDate targetDate, boolean isDone) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
        this.targetDate = targetDate;
        this.status = isDone;
    }

    public Todo(String title, String description, LocalDate targetDate, boolean isDone) {
        super();
        this.title = title;
        this.description = description;
        this.targetDate = targetDate;
        this.status = isDone;
        this.fid=LoginDao.getid();
    }

    public Long getId() {
        return id;
    }
    public void setfid()
    {
    	this.fid=LoginDao.getid();
    }
    public int getfid()
    {
    	return fid;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int)(id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Todo other = (Todo) obj;
        if (id != other.id)
            return false;
        return true;
    }
}