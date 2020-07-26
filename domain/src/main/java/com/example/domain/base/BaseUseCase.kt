package com.example.domain.base

import com.example.domain.model.Result

interface BaseUseCase<T : Any, R: Any> {
  suspend operator fun invoke(param: T): Result<R>

  suspend operator fun invoke(params: List<T>): Result<List<R>>
}