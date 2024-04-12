package org.petrolpump.admin.repository;

import java.util.List;

import org.petrolpump.admin.model.*;

public interface MachineRepository {
	public boolean isAddNewMachine(MachineModel model);
	public List<MachineModel> getAllMachines();
	public boolean isDeleteMachineById(int mid);
	public boolean isUpdateMachine(MachineModel model);

}
