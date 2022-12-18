package com.ruoyi.todolist.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.todolist.mapper.TodolistMapper;
import com.ruoyi.todolist.domain.Todolist;
import com.ruoyi.todolist.service.ITodolistService;

/**
 * TodolistService业务层处理
 * 
 * @author Lyu
 * @date 2022-12-17
 */
@Service
public class TodolistServiceImpl implements ITodolistService 
{
    @Autowired
    private TodolistMapper todolistMapper;

    /**
     * 查询Todolist
     * 
     * @param id Todolist主键
     * @return Todolist
     */
    @Override
    public Todolist selectTodolistById(Long id)
    {
        return todolistMapper.selectTodolistById(id);
    }

    /**
     * 查询Todolist列表
     * 
     * @param todolist Todolist
     * @return Todolist
     */
    @Override
    public List<Todolist> selectTodolistList(Todolist todolist)
    {
        return todolistMapper.selectTodolistList(todolist);
    }

    /**
     * 新增Todolist
     * 
     * @param todolist Todolist
     * @return 结果
     */
    @Override
    public int insertTodolist(Todolist todolist)
    {
        return todolistMapper.insertTodolist(todolist);
    }

    /**
     * 修改Todolist
     * 
     * @param todolist Todolist
     * @return 结果
     */
    @Override
    public int updateTodolist(Todolist todolist)
    {
        return todolistMapper.updateTodolist(todolist);
    }

    /**
     * 批量删除Todolist
     * 
     * @param ids 需要删除的Todolist主键
     * @return 结果
     */
    @Override
    public int deleteTodolistByIds(Long[] ids)
    {
        return todolistMapper.deleteTodolistByIds(ids);
    }

    /**
     * 删除Todolist信息
     * 
     * @param id Todolist主键
     * @return 结果
     */
    @Override
    public int deleteTodolistById(Long id)
    {
        return todolistMapper.deleteTodolistById(id);
    }
}
