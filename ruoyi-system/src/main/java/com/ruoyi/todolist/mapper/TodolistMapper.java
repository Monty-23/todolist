package com.ruoyi.todolist.mapper;

import java.util.List;
import com.ruoyi.todolist.domain.Todolist;

/**
 * TodolistMapper接口
 * 
 * @author Lyu
 * @date 2022-12-17
 */
public interface TodolistMapper 
{
    /**
     * 查询Todolist
     * 
     * @param id Todolist主键
     * @return Todolist
     */
    public Todolist selectTodolistById(Long id);

    /**
     * 查询Todolist列表
     * 
     * @param todolist Todolist
     * @return Todolist集合
     */
    public List<Todolist> selectTodolistList(Todolist todolist);

    /**
     * 新增Todolist
     * 
     * @param todolist Todolist
     * @return 结果
     */
    public int insertTodolist(Todolist todolist);

    /**
     * 修改Todolist
     * 
     * @param todolist Todolist
     * @return 结果
     */
    public int updateTodolist(Todolist todolist);

    /**
     * 删除Todolist
     * 
     * @param id Todolist主键
     * @return 结果
     */
    public int deleteTodolistById(Long id);

    /**
     * 批量删除Todolist
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTodolistByIds(Long[] ids);
}
