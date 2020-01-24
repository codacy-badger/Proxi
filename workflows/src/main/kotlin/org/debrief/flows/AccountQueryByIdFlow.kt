package org.debrief.flows

import net.corda.accounts.states.AccountInfo
import net.corda.core.flows.FlowLogic
import net.corda.core.flows.StartableByRPC

@StartableByRPC
class AccountQueryByIdFlow(private val accountId: String) : FlowLogic<AccountInfo>() {
    override fun call(): AccountInfo {
        return AccountUtils.getAccountByUUID(serviceHub, accountId)
    }
}
