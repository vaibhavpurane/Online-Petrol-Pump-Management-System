package org.petrolpump.admin.repository;

import java.util.*;

import org.petrolpump.admin.config.DBConfig;
import org.petrolpump.admin.model.MachineModel;

public class MachineRepositoryImpl extends DBConfig implements MachineRepository{
	List<MachineModel> list;
	@Override
	public boolean isAddNewMachine(MachineModel model) {
		try {
			pstmt=conn.prepareStatement("insert into machineinfo values('0',?)");
			pstmt.setString(1,model.getMachineCode());
			int value=pstmt.executeUpdate();
			return value>0 ? true:false ;
		}catch(Exception ex) {
			System.out.println("Exception is "+ex);
			return false;
		}	
	}

	@Override
	public List<MachineModel> getAllMachines() {
		
		try {
			list=new ArrayList<MachineModel>();
			pstmt=conn.prepareStatement("select * from machineinfo");
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				MachineModel model = new MachineModel();
				model.setId(rs.getInt(1));
				model.setMachineCode(rs.getString(2));
				list.add(model);
			}
			return list.size()>0?list:null;
			
		}catch(Exception ex) {
			System.out.println("Exception is "+ex);
			return null;
		}
		
		
	}

	@Override
	public boolean isDeleteMachineById(int mid) {
		try {
		pstmt=conn.prepareStatement("delete from machineinfo where mid=?");
		pstmt.setInt(1, mid);
		int value=pstmt.executeUpdate();
		return value>0?true:false;
		}
		catch(Exception e) {
			System.out.println("Exception is "+e);
			return false;
		}
		
		
	}

	@Override
	public boolean isUpdateMachine(MachineModel model) {
		try {
			pstmt=conn.prepareStatement("update machineinfo set machineCode=? where mid=?");
			pstmt.setString(1, model.getMachineCode());
			pstmt.setInt(2, model.getId());
			int value=pstmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception e) {
			System.out.println("Exception is "+e);
			return false;
		}
		
	}

}
