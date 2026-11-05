1	Lấy danh sách tất cả bác sĩ	GET	/api/v1/doctors
2	Lấy thông tin bác sĩ theo ID	GET	/api/v1/doctors/{id}
3	Thêm mới bác sĩ	POST	/api/v1/doctors
4	Cập nhật thông tin bác sĩ	PUT	/api/v1/doctors/{id}
5	Xóa bác sĩ	DELETE	/api/v1/doctors/{id}

================================

TH1: Bỏ trống tên bệnh nhân - 400 Bad Request - Dữ liệu request không hợp lệ
TH2: ID hồ sơ bệnh án 999 không tồn tại - 404 Not Found - Không tìm thấy tài nguyên
TH3: Database MySQL bị sập - 500 Internal Server Error - Lỗi xảy ra phía server
TH4: Tuổi bệnh nhân là -5 - 400 Bad Request - Dữ liệu không hợp lệ về mặt logic

================================

1	Lấy tất cả lịch hẹn của một bác sĩ - GET    /api/v1/doctors/{doctorId}/appointments
2	Lấy một đơn thuốc cụ thể của bệnh nhân - GET    /api/v1/patients/{patientId}/prescriptions/{prescriptionId}
3	Thêm đơn thuốc mới cho bệnh nhân - POST /api/v1/patients/{patientId}/prescriptions

================================

1	Sử dụng POST	Cập nhật thông tin tài nguyên đã tồn tại nên ưu tiên PUT hoặc PATCH.
2	Sử dụng danh từ số ít doctor	Nên sử dụng danh từ số nhiều doctors.
3	Đưa động từ update-info vào URL	RESTful URL nên thể hiện tài nguyên, HTTP Method thể hiện hành động.
4	Truyền ID qua Query Param	ID của một tài nguyên cụ thể nên đặt trên Path Param.