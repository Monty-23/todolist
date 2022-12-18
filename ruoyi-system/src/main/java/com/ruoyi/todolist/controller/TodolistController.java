package com.ruoyi.todolist.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.todolist.domain.Todolist;
import com.ruoyi.todolist.service.ITodolistService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * TodolistController
 * 
 * @author Lyu
 * @date 2022-12-17
 */
@RestController
@RequestMapping("/todolist/todolist")
public class TodolistController extends BaseController
{
    @Autowired
    private ITodolistService todolistService;

    /**
     * 查询Todolist列表
     */
    @PreAuthorize("@ss.hasPermi('todolist:todolist:list')")
    @GetMapping("/list")
    public TableDataInfo list(Todolist todolist)
    {
        startPage();
        List<Todolist> list = todolistService.selectTodolistList(todolist);
        return getDataTable(list);
    }

    /**
     * 导出Todolist列表
     */
    @PreAuthorize("@ss.hasPermi('todolist:todolist:export')")
    @Log(title = "Todolist", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Todolist todolist)
    {
        List<Todolist> list = todolistService.selectTodolistList(todolist);
        ExcelUtil<Todolist> util = new ExcelUtil<Todolist>(Todolist.class);
        util.exportExcel(response, list, "Todolist数据");
    }

    /**
     * 获取Todolist详细信息
     */
    @PreAuthorize("@ss.hasPermi('todolist:todolist:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(todolistService.selectTodolistById(id));
    }

    /**
     * 新增Todolist
     */
    @PreAuthorize("@ss.hasPermi('todolist:todolist:add')")
    @Log(title = "Todolist", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Todolist todolist)
    {
        return toAjax(todolistService.insertTodolist(todolist));
    }

    /**
     * 修改Todolist
     */
    @PreAuthorize("@ss.hasPermi('todolist:todolist:edit')")
    @Log(title = "Todolist", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Todolist todolist)
    {
        return toAjax(todolistService.updateTodolist(todolist));
    }

    /**
     * 删除Todolist
     */
    @PreAuthorize("@ss.hasPermi('todolist:todolist:remove')")
    @Log(title = "Todolist", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(todolistService.deleteTodolistByIds(ids));
    }
}
