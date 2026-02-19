// $("#addCustomer").on("click", () => {
//   const cid = $("#custormerId").val().trim();
//   const cname = $("#customerName").val().trim();
//   const ccontact = $("#customerAddress").val().trim();

//   if (!cid || !cname || !ccontact) {
//     alert("okkkk");
//   }

//   $.ajax({
//     url: "http://localhost:8080/Backend_war_exploded/custormer",
//     method: "POST",
//     contentType: "application/json",
//     data: JSON.stringify({
//       id: cid,
//       name: cname,
//       contact: ccontact,
//       email: cemail,
//       address: caddres,
//     }),
//     success: function (response, textStatus, xhr) {
//       console.log("================");
//       console.log(xhr.status);
//       console.log("================");
//       if (xhr.status === 201) {
//         Swal.fire({
//           title: "Success!",
//           text: "Save Success fully 🙂..",
//           icon: "success",
//           timer: 2000,
//         });

//         getAllmethod();
//         clearForm();
//       } else {
//         Swal.fire({
//           title: "UnSuccess Fully!",
//           text: "Save UnSuccess fully 🙂..",
//           icon: "error",
//           timer: 700,
//         });
//       }
//     },
//     error: function (respons) {
//       Swal.fire({
//         title: "UnSuccess Fully!",
//         text: "Save Success fully 🙂..",
//         icon: "error",
//         timer: 3000,
//       });
//     },
//   });
// });
