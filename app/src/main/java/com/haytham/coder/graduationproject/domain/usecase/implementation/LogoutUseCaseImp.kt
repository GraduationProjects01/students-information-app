package com.haytham.coder.graduationproject.domain.usecase.implementation

import com.haytham.coder.graduationproject.domain.repository.UserRepository
import com.haytham.coder.graduationproject.domain.usecase.contract.LogoutUseCase

class LogoutUseCaseImp(private val userRepository: UserRepository):
    LogoutUseCase {
    override suspend fun invoke() {
        userRepository.logout()
    }

}