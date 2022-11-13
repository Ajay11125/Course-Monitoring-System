package app.BatchUseCase;

import java.io.IOException;

import app.dao.BatchDAO;
import app.dao.BatchDAOimpl;
import app.main.Batch_panel;

public class ViewAllBatches {
	public static void main(String[] args) throws IOException {
		BatchDAO dao=new BatchDAOimpl();
		dao.ViewAllBatches();
		Batch_panel bp=new Batch_panel();
		bp.main(args);
	}
}
