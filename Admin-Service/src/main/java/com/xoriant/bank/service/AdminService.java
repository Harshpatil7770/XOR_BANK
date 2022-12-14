package com.xoriant.bank.service;

import java.util.List;

import com.xoriant.bank.dto.BranchDTO;
import com.xoriant.bank.dto.ManagerDTO;
import com.xoriant.bank.model.Branch;
import com.xoriant.bank.model.Manager;

public interface AdminService {

	Branch addNewBranch(BranchDTO branchDTO);

	Branch updateBranchDetails(BranchDTO branchDTO);

	List<Branch> fetchAllBranch();

	Branch findByBranchId(long branchId);

	Branch findByName(String branchName);

	void deleteBranch(long branchId);

	Manager addNewManager(ManagerDTO managerDTO);

	Manager updateManagerDetails(ManagerDTO managerDTO);

	List<Manager> addNewListsOfManager(List<ManagerDTO> managerDTOLists);

	List<Manager> updateListsOfManager(List<ManagerDTO> managerDTOLists);

	List<Manager> fetchAllManagerDetails();

	Manager findByManagerId(long managerId);

	Manager findByFirstNameAndLastName(String firstName, String lastName);

	List<Manager> fetchAllManagerListsInAlphabeticalOrder();

	Manager findManagerByBranchId(long branchId);

	void deleteManager(long managerId);
}
