import request from '@/utils/request'

// 查询Todolist列表
export function listTodolist(query) {
  return request({
    url: '/todolist/todolist/list',
    method: 'get',
    params: query
  })
}

// 查询Todolist详细
export function getTodolist(id) {
  return request({
    url: '/todolist/todolist/' + id,
    method: 'get'
  })
}

// 新增Todolist
export function addTodolist(data) {
  return request({
    url: '/todolist/todolist',
    method: 'post',
    data: data
  })
}

// 修改Todolist
export function updateTodolist(data) {
  return request({
    url: '/todolist/todolist',
    method: 'put',
    data: data
  })
}

// 删除Todolist
export function delTodolist(id) {
  return request({
    url: '/todolist/todolist/' + id,
    method: 'delete'
  })
}
