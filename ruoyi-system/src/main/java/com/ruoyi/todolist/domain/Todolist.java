package com.ruoyi.todolist.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * Todolist对象 todolist
 * 
 * @author Lyu
 * @date 2022-12-17
 */
public class Todolist extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 事务名称 */
    @Excel(name = "事务名称")
    private String work;

    /** 完成情况 */
    @Excel(name = "完成情况")
    private String done;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setWork(String work) 
    {
        this.work = work;
    }

    public String getWork() 
    {
        return work;
    }
    public void setDone(String done) 
    {
        this.done = done;
    }

    public String getDone() 
    {
        return done;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("work", getWork())
            .append("done", getDone())
            .toString();
    }
}
