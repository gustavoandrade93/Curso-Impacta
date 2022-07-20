package br.impacta.view.service;

import java.awt.Desktop;
//import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import br.impacta.model.ProgramadorPhp;
import br.impacta.model.ProgramadorJava;
import br.impacta.repository.RepositorioProgramadorJava;
import br.impacta.repository.RepositorioProgramadorPhp;

public class GerarPDF {

	RepositorioProgramadorPhp repositorioProgramadorPhp = new RepositorioProgramadorPhp();
	RepositorioProgramadorJava repositorioProgramadorJava = new RepositorioProgramadorJava();
	
	public static void gerarPdfProgramadorPhp() {
	
		RepositorioProgramadorPhp repositorioProgramadorPhp = new RepositorioProgramadorPhp();
		Document docPhp = new Document();
		float fntSize, lineSpacing;
		fntSize = 6.7f;
		lineSpacing = 10f;
		String arquivoPdfPhp = "ListaProgramadorPhp.pdf";
		try {
			PdfWriter.getInstance(docPhp, new FileOutputStream(arquivoPdfPhp));
			docPhp.open();
			Paragraph paragrafo = new Paragraph();
			paragrafo.setAlignment(1);
			docPhp.add(paragrafo);
			
			Image image = Image.getInstance("imagens/logo.png");
			image.setAlignment(1);
			image.scaleToFit(200, 200);
			docPhp.add(image);
			
			
			
			paragrafo = new Paragraph("Lista de Programadores PHP",FontFactory.getFont(FontFactory.TIMES, 20f));
			paragrafo.setAlignment(1);
			docPhp.add(paragrafo);
			
			paragrafo = new Paragraph("  ",FontFactory.getFont(FontFactory.TIMES, 20f));
			paragrafo.setAlignment(1);
			docPhp.add(paragrafo);
			
			PdfPTable tabelaPDF = new PdfPTable(new float[] { 900f, 2500f,3500f,1000f,800f,1000f,900f });;
			
			PdfPCell celulaMatricula = new PdfPCell(new Paragraph("Matricula",FontFactory.getFont(FontFactory.TIMES, fntSize)));
			PdfPCell celulaNome = new PdfPCell(new Paragraph("Nome",FontFactory.getFont(FontFactory.TIMES, fntSize)));
			PdfPCell celulaSalario = new PdfPCell(new Paragraph("Salario",FontFactory.getFont(FontFactory.TIMES, fntSize)));
			PdfPCell celulaCertificacaoPhp= new PdfPCell(new Paragraph("CertificacaoPhp",FontFactory.getFont(FontFactory.TIMES, fntSize)));
			
			
			tabelaPDF.addCell(celulaMatricula);
			tabelaPDF.addCell(celulaNome);
			tabelaPDF.addCell(celulaSalario);
			tabelaPDF.addCell(celulaCertificacaoPhp);
			
			
			
			for (ProgramadorPhp programadorPhp: repositorioProgramadorPhp.listarProgramadorPhp()) {
				celulaMatricula = new PdfPCell(new Paragraph(programadorPhp.getMatricula(),FontFactory.getFont(FontFactory.TIMES, fntSize)));
				celulaNome = new PdfPCell(new Paragraph(programadorPhp.getNome(),FontFactory.getFont(FontFactory.TIMES, fntSize)));
				celulaSalario = new PdfPCell(new Paragraph(String.valueOf(programadorPhp.getSalario()),FontFactory.getFont(FontFactory.TIMES, fntSize)));
				celulaCertificacaoPhp = new PdfPCell(new Paragraph(programadorPhp.getCertificacaoPhp(),FontFactory.getFont(FontFactory.TIMES, fntSize)));
				
				
				tabelaPDF.addCell(celulaMatricula);
				tabelaPDF.addCell(celulaNome);
				tabelaPDF.addCell(celulaSalario);
				tabelaPDF.addCell(celulaCertificacaoPhp);
			}
			
			docPhp.add(tabelaPDF);
			docPhp.close();
			Desktop.getDesktop().open(new File (arquivoPdfPhp));
			
		}
		catch (Exception e) {
			
		}
	}
		
		public static void gerarPdfProgramadorJava() {
			
			RepositorioProgramadorJava repositorioProgramadorJava = new RepositorioProgramadorJava();
		
			Document docJava = new Document();
			float fntSizeJava, lineSpacingJava;
			fntSizeJava = 6.7f;
			lineSpacingJava = 10f;
			String arquivoPdfJava = "ListaProgramadorJava.pdf";
			try {
			PdfWriter.getInstance(docJava, new FileOutputStream(arquivoPdfJava));
			docJava.open();
			Paragraph paragrafo = new Paragraph();
			paragrafo.setAlignment(1);
			docJava.add(paragrafo);
			
			Image image = Image.getInstance("imagens/logo.png");
			image.setAlignment(1);
			image.scaleToFit(200, 200);
			docJava.add(image);
			
			
			
			paragrafo = new Paragraph("Lista de Programadores Java",FontFactory.getFont(FontFactory.TIMES, 20f));
			paragrafo.setAlignment(1);
			docJava.add(paragrafo);
			
			paragrafo = new Paragraph("  ",FontFactory.getFont(FontFactory.TIMES, 20f));
			paragrafo.setAlignment(1);
			docJava.add(paragrafo);
			
			PdfPTable tabelaPDF = new PdfPTable(new float[] { 900f, 2500f,3500f,1000f,800f,1000f,900f });;
			
			PdfPCell celulaMatricula = new PdfPCell(new Paragraph("Matricula",FontFactory.getFont(FontFactory.TIMES, fntSizeJava)));
			PdfPCell celulaNome = new PdfPCell(new Paragraph("Nome",FontFactory.getFont(FontFactory.TIMES, fntSizeJava)));
			PdfPCell celulaCertificacaoOracle = new PdfPCell(new Paragraph("CertificacaoOracle",FontFactory.getFont(FontFactory.TIMES, fntSizeJava)));
			PdfPCell celulaSalario = new PdfPCell(new Paragraph("Salario",FontFactory.getFont(FontFactory.TIMES, fntSizeJava)));
			
			tabelaPDF.addCell(celulaMatricula);
			tabelaPDF.addCell(celulaNome);
			tabelaPDF.addCell(celulaSalario);
			tabelaPDF.addCell(celulaCertificacaoOracle);
			
			
			
			for (ProgramadorJava programadorJava: repositorioProgramadorJava.listarProgramadorJava()) {
				celulaMatricula = new PdfPCell(new Paragraph(programadorJava.getMatricula(),FontFactory.getFont(FontFactory.TIMES, fntSizeJava)));
				celulaNome = new PdfPCell(new Paragraph(programadorJava.getNome(),FontFactory.getFont(FontFactory.TIMES, fntSizeJava)));
				celulaSalario = new PdfPCell(new Paragraph(String.valueOf(programadorJava.getSalario()),FontFactory.getFont(FontFactory.TIMES, fntSizeJava)));
				celulaCertificacaoOracle = new PdfPCell(new Paragraph(programadorJava.getCertificacaoOracle(),FontFactory.getFont(FontFactory.TIMES, fntSizeJava)));

				
				tabelaPDF.addCell(celulaMatricula);
				tabelaPDF.addCell(celulaNome);
				tabelaPDF.addCell(celulaSalario);
				tabelaPDF.addCell(celulaCertificacaoOracle);
			}
			
			docJava.add(tabelaPDF);
			docJava.close();
			Desktop.getDesktop().open(new File (arquivoPdfJava));
			
		} catch (Exception e) {
			
		}
		
	}
	
}
