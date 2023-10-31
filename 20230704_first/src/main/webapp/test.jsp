<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<!-- err heaven -->
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>카페 포스기</title>
<script src="/lesson/resources/js/jquery-3.7.0.js"></script>
<link href="/lesson/resources/css/reset.css" rel="stylesheet">
<!-- style 지정 - 각자 실습 -->
<style>
</style>
<!--  -->
<script>
	$(loadedHandler);
	function loadedHandler() {
		// event 등록
		// $(".c").on("blur", cntBlurHandler);
		$("[type=button]").on("click", calcClickHandler);
	}

	//각종 기능 함수들
	function cntBlurHandler(event) {
		// console.log(this);
		// console.log(event.target); // event.target == this
		// console.log(event);
		// 각자 실습

		$(".c.in").each(
				function() {
					// this = item
					console.log(this);
					// console.log($(this).val()); // console.log(this.value);
					// 메뉴마다 합계 가격
					$(this).parent().next().children('input.p').val(
							$(this).parent().prev().text() * $(this).val());
					updateTotal();
				});

		var sum = 0;
		// 합계
		// each - for문은 대신함. event에 handler를 등록함
		$(".c.in").each(function(idx, item) {
			// console.log(price);
			// item == this
			console.log(item);
			// if (idx != ($(".c").length - 1)) {
			var i = Number($(item).val());
			if (isNaN(i)) {
				i = 0;
			}
			sum += i;
			// }
		});
		console.log(sum);
		$("#cTitalCnt").val(sum);
		$("#cTotalPrice").val();

	}
	sum = 0;
	// 합계
	$(".p").each(function(idx, item) {
		console.log(item);
		if (idx != ($(".p").length - 1)) {
			// Number() 대신 * 1 로 숫자 형태 변경
			sum += $(item).val() * 1;
			if (isNaN(i)) {
				i = 0;
			}
			sum += i;
		}
	});
	console.log(sum);
	$("#cTotalPrice").val(sum);

	function calcClickHandler(event) {
		// 각자 실습
		$(".c.in").each(function(idx, item) {
			// item == this
			console.log(item);
			// if (idx != ($(".c").length - 1)) {
			var i = Number($(item).val());
			if (isNaN(i)) {
				i = 0;
			}
			sum += i;
			// }
		});

	}
	sum = 0;
	// 합계
	$(".p").each(function(idx, item) {
		console.log(item);
		if (idx != ($(".p").length - 1)) {
			// Number() 대신 * 1 로 숫자 형태 변경
			sum += $(item).val() * 1;
			if (isNaN(i)) {
				i = 0;
			}
			sum += i;
		}
	});
	console.log(sum);
	$("#cTotalPrice").val(sum);}
        // each의 경우 event handler 처럼 함수 형태 만들어서 사용하지 않는 것이 권장됨
</script>
</head>

<body>
당신이 요청한 값 n1의 값 <%=request %>
	<table border="1">
		<tr>
			<th>메뉴</th>
			<th>가격</th>
			<th>수량</th>
			<th>합계</th>
		</tr>
		<tr>
			<td>아메리카노</td>
			<td>2500</td>
			<td><input type="text" name="c1" id="c1" class="c"></td>
			<td><input type="text" name="c1Price" id="c1Price" class="p"
				readonly></td>
		</tr>
		<tr>
			<td>라떼</td>
			<td>3000</td>
			<td><input type="text" name="c2" id="c2" class="c"></td>
			<td><input type="text" name="c2Price" id="c2Price" class="p"
				readonly></td>
		</tr>
		<tr>
			<td>생강라떼</td>
			<td>4500</td>
			<td><input type="text" name="c3" id="c3" class="c"></td>
			<td><input type="text" name="c3Price" id="c3Price" class="p"
				readonly></td>
		</tr>
		<tr>
			<td>딸기바나나라떼</td>
			<td>4000</td>
			<td><input type="text" name="c4" id="c4" class="c"></td>
			<td><input type="text" name="c4Price" id="c4Price" class="p"
				readonly></td>
		</tr>
		<tr>
			<th>합계</th>
			<th></th>
			<th><input type="text" name="cTotalCnt" id="cTotalCnt" class="c"
				readonly></th>
			<th><input type="text" name="cTotalPrice" id="cTotalPrice"
				class="p" readonly></th>
		</tr>
		<tr>
			<td colspan="4"><input type="button" value="계산하기"> <input
				type="reset"></td>
		</tr>
	</table>


	<script>
		
	</script>


</body>

</html>